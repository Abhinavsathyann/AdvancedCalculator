:: ===============================
:: 🚀 ADVANCED JAVA CALCULATOR – ONE TERMINAL RUN
:: ===============================

@echo off
title Advanced Java Calculator – One Terminal Setup & Run

echo.
echo ===================================================
echo       ⚙️  ADVANCED JAVA CALCULATOR  (A-Z RUN)
echo ===================================================
echo.

:: Step 1️⃣ — Navigate to project folder
cd /d "C:\Users\abhin\OneDrive\Desktop\AdvancedCalculator"

:: Step 2️⃣ — Clean Java options (fix invalid layout bug)
set JAVA_TOOL_OPTIONS=
echo ✅ Java tool options cleared.

:: Step 3️⃣ — Disable shared archive temporarily
java -Xshare:off -version

:: Step 4️⃣ — Compile all .java files
echo.
echo 🧩 Compiling Java source files...
javac *.java

if %errorlevel% neq 0 (
    echo ❌ Compilation failed! Check for syntax errors.
    pause
    exit /b
) else (
    echo ✅ Compilation successful.
)

:: Step 5️⃣ — Run the Calculator app
echo.
echo 🚀 Launching Advanced Java Calculator...
echo.
java -Xshare:off HomePage

:: Step 6️⃣ — Post-run message
echo.
echo ===================================================
echo 🎉  APP CLOSED SUCCESSFULLY
echo 💡  Tip: Next time, just run this file again.
echo ===================================================
pause
exit
