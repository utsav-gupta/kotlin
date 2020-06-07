# kotlin

This project is a chrome pluign in kotlin. 
This plugin captures the current url in tab and shows it in an alert box.
This is build using kotlinjs. This wraps the chrome Apis written in javascript and access it in kotlin.


Steps for launching:

prerequistes:
 
 you should have webpack and webpack cli installed in your machine.
 
 Steps:
 
 1. Run sudo ./gradlew clean assemble.
 2. This will result in a set of files being generated in <ROOT FOLDER>/build/extension, name of these files: popup.js
popup.html
manifest.json
kotlin.png
browser-polyfill.min.js
  
  3. In chrome open extensions and enable developer option, select load unpacked and then select the extension folder to upload.
  
  4. The extension is now active and enabled in chrome, you can see a kotlin logo in your chrome browser.
  5. Open any tab now and and click icon and you would see the url in the alert box.
