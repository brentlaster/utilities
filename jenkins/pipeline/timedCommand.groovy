public timedCommand(String cmd, String logFilePath) {
   timestamps {
      cmdOutput = sh (script:"${cmd}", returnStdout:true).trim()
   }
   echo cmdOutput
   writeFile file: "${logFilePath}", text: "${cmdOutput}"
}
return this;
