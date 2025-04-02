# ANDROID INSTALLATION

To run Android tests with Appium, you'll need to pre-install several
dependencies on your development machine. This guide will walk you through the
necessary steps.

Don't worry if you don't understand all the details initially—Appium abstracts
much of the complexity. You can always explore more specific capabilities of
these libraries later if needed.

---

## ✏️ Installation Steps

### Installing Android Tools

These instructions are for Mac OS X users. If you are using Windows, please
refer to
the [official Android Studio installation guide](https://developer.android.com/studio/install).

> **Note:** The following steps will install the minimal tools needed to run
> tests. For a full Android Studio installation, follow
> the [Android Studio setup guide](https://developer.android.com/studio/install).

1. **Install OpenJDK and Android Command Line Tools**

   Open a terminal and run the following commands to update Homebrew and install
   the required dependencies:

   ```bash
   brew update
   brew install openjdk@17
   brew install android-commandlinetools --cask
   ```

2. **Set Up Environment Variables**

   Set the `ANDROID_SDK_ROOT` environment variable by adding the following line
   to your `~/.zprofile`:

   ```bash
   echo "export ANDROID_SDK_ROOT=/opt/homebrew/share/android-commandlinetools/" >> ~/.zprofile
   source ~/.zprofile
   ```

3. **Install Android SDK Components**

   Install the essential Android SDK components using `sdkmanager`. If you are
   using an Intel-based Mac, replace `arm64-v8a` with `x86_64` in the command
   below:

   ```bash
   sdkmanager "build-tools;33.0.0" "platform-tools" "emulator" "system-images;android-33;google_apis;arm64-v8a" "platforms;android-33"
   ```

4. **Verify Installation and Create an Android Virtual Device (AVD)**

   Run the following commands to verify the installation and create an Android
   Virtual Device (AVD):

   ```bash
   # Verify installed components
   sdkmanager --list_installed

   # Create an AVD
   avdmanager create avd -n "Pixel_5" -d "pixel_5" -k "system-images;android-33;google_apis;arm64-v8a"

   # List available AVDs
   emulator -list-avds

   # Launch the emulator
   emulator -avd Pixel_5
   ```

### Installing Appium 2.x

If you have previously installed Appium using Homebrew, you may need to
uninstall it to avoid conflicts. Additionally, remove any `appium-doctor` or
`appium-desktop` packages.

1. **Install Appium**

   Install the latest version of Appium globally using `npm`:

   ```bash
   npm i -g appium@next
   ```

2. **Install the Required WebDriver**

   After installing Appium, install the required WebDriver for Android:

   ```bash
   appium driver install uiautomator2
   ```

### Installing Appium Inspector

Appium Inspector is a GUI tool that helps you inspect the elements of your app
and retrieve their locators. You can download it from
the [Appium Inspector GitHub releases page](https://github.com/appium/appium-inspector/releases).

---

## 🐞 Troubleshooting

### Error: Appium Cannot Locate the Device

If Appium cannot locate your device, it may have a different name than the one
specified in your configuration. To find the correct device name, use the
following command:

```bash
adb devices
```

The output will look similar to this:

```
List of devices attached
emulator-5554	device
```

In this example, the device name is `emulator-5554`. Make sure to update the
device name in the `/src/test/resources/serenity.conf` file accordingly.
