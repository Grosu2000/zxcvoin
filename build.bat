@echo off
echo Compiling project...
if not exist out mkdir out
javac -encoding UTF-8 -d out src\com\calculator\*.java src\com\calculator\operations\*.java
if %errorlevel% neq 0 (
    echo Compilation failed.
    exit /b 1
)
echo Compilation successful.
