@echo off
cls 

javac -d bin src\*.java src\models\*.java src\interfaces\*.java src\menu\*.java src\services\*.java

java -cp bin Main
