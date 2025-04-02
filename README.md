# Appium + Java + Android - 2023

This project leverages the **Screenplay Design Pattern**, which promotes the
adherence to SOLID principles for better maintainability and scalability of
automated test scripts.

For a similar setup targeting iOS (Apple iPhone), visit the following
repository: [Appium + Java + iOS - 2023](https://github.com/AlexAndradeNet/appiumjavaios).

This project is inspired by and based on the work available
at [Jacobvu84's Serenity Screenplay Appium repository](https://github.com/Jacobvu84/serenity-screenplay-appium/).

---

## 🔧 Tech Stack

The following technologies are utilized in this project:

- **Java 17**
- **Appium 2.x**
- **Serenity BDD**
- **Cucumber**
- **Gradle**
- **Android 13**
- **Android SDK**
- **IntelliJ IDEA**

To set up the development environment, refer to the detailed installation guide
provided in [INSTALLATION.md](docs/INSTALLATION.md).

---

## 👍🏽 Contributing

Thank you for considering contributing to this
repository! [Here is everything](docs/CONTRIBUTE-java.md)
you need to know to get started.

---

## 🚀 Running the Project

Follow the steps below to execute the tests:

1. Update the device name in `/src/test/resources/serenity.conf`.
2. Start the Android emulator with the following command:

   ```bash
   emulator -avd Pixel_5 -no-boot-anim -no-audio
   ```

3. Start the Appium server:

   ```bash
   appium --allow-insecure=true --allow-cors --session-override
   ```

4. Run the tests. You can choose to run them from the terminal or directly from
   IntelliJ. Details are provided in the next sections.

### Running from Gradle / Terminal

1. Open a terminal.
2. Navigate to the project's root directory.
3. Execute the following command:

   ```bash
   ./gradlew clean test aggregate
   ```

### Running a Feature File from IntelliJ

1. Right-click on the `feature` file you want to run.
2. Go to the **Run** menu and select **Run...**.
3. From the contextual menu, choose the feature, then select **Edit...**.
4. In the 'Edit Configuration Settings' window, set the main class to
   `net.serenitybdd.cucumber.cli.Main`.
5. Set the Glue field to the root package of your project (or the location of
   your step definitions).
6. Click **Apply**.

For additional details,
visit [John Ferguson Smart's blog post on running Cucumber Serenity feature files in IntelliJ](https://johnfergusonsmart.com/running-cucumber-serenity-feature-files-directly-intellij/).

---

## 📊 Reporting

Test reports are generated in the `target/site/serenity` directory. To view the
report in your browser:

- **On Mac:**

  ```bash
  open target/site/serenity/index.html
  ```

- **On Windows:**

  ```powershell
  start target/site/serenity/index.html
  ```

---

## 💅🏽 Linting / Coding Style

Maintaining a consistent coding style is crucial for readability and
collaboration.

> "The ratio of time spent reading versus writing is well over 10 to 1. We are
> constantly reading old code as part of the effort to write new code. …making
> it
> easy to read makes it easier to write."
>
> _Robert C. Martin (a.k.a Uncle Bob)_

### Java

Java files are formatted using the Google Java Format rules. You can check and
fix the formatting by running:

- **To check the code:**

  ```bash
  ./gradlew clean build spotlessCheck
  ```

- **To fix the code:**

  ```bash
  ./gradlew clean build spotlessApply
  ```

### Linting Gherkin Files

Gherkin files are linted using the `gherkin-lint` tool. The configuration is
available in `.gherkin-lintrc.json`. Run the following command to lint Gherkin
files:

```bash
sh gherkin_check.sh
```

---

## 🐞 Troubleshooting

### GitHub Deleting the APK File

GitHub automatically deletes the APK file after 100 days. If you need the APK,
you can download it from the following
link: [MetaTrader 5 Trading Platform for Android](https://metatrader-5-trading-platform.en.softonic.com/android).
