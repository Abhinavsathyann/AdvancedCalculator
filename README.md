# ⚙️ Advanced Java Calculator

A multi-page advanced calculator built in **Java Swing**, featuring **Basic**, **Scientific**, **Programmer**, and **Unit Converter** tools — plus **History**, **Settings**, **Help**, and **About** pages.  
Designed for clarity, efficiency, and user experience.

---

## 🧠 Features

- 🧮 **Basic Calculator** — Standard arithmetic operations  
- 📈 **Scientific Calculator** — Trigonometric, logarithmic, and exponential functions  
- 💻 **Programmer Mode** — Binary, Octal, Hexadecimal conversions  
- 📏 **Unit Converter** — Convert length, weight, and temperature  
- 📜 **History** — Review your previous calculations  
- ⚙️ **Settings** — Customize appearance and behavior  
- ❓ **Help Section** — Quick guide and keyboard shortcuts  
- ℹ️ **About Page** — App info and credits  
- 🚪 **Exit Confirmation** — Prevents accidental app closure  

---

## 🧩 Project Structure
📁 AdvancedCalculator
├── HomePage.java
├── BasicCalculator.java
├── ScientificCalculator.java
├── ProgrammerCalculator.java
├── UnitConverter.java
├── HistoryPage.java
├── SettingsPage.java
├── HelpPage.java
├── AboutPage.java
└── CalculatorMain.java


---

## ⚙️ Requirements

- Java JDK 17 or newer (recommended: [Eclipse Adoptium Temurin JDK 21+](https://adoptium.net/temurin/releases/))
- Works on **Windows**, **macOS**, and **Linux**

---

## 🚀 Setup & Run

### ▶️ 1. Open Terminal (or CMD) and Navigate to Your Project
```bash
cd "C:\Users\abhin\OneDrive\Desktop\AdvancedCalculator"

🧹 2. Clear Java Cache (to fix VM layout errors)
set JAVA_TOOL_OPTIONS=
java -Xshare:off -version

🧩 3. Compile All Java Files
javac *.java

💻 4. Run the Application
java -Xshare:off HomePage


💡 Tip:
If you face “Invalid layout of java.lang.Class field” error, re-run with -Xshare:off or reinstall JDK.

🛠 Optional: Create a Launcher (runCalculator.bat)

Create a file named runCalculator.bat inside your project folder and paste this:

@echo off
title Advanced Java Calculator
set JAVA_TOOL_OPTIONS=
javac *.java
java -Xshare:off HomePage
pause

Now you can simply double-click the .bat file to compile and run automatically 🎯

🎨 UI Preview
┌──────────────────────────────────────────────┐
│ ⚙️  Advanced Java Calculator                 │
│──────────────────────────────────────────────│
│ [🧮 Basic]   [📈 Scientific]  [💻 Programmer] │
│ [📏 Unit]    [📜 History]     [⚙️ Settings]  │
│ [❓ Help]    [ℹ️ About]       [🚪 Exit]      │
└──────────────────────────────────────────────┘
