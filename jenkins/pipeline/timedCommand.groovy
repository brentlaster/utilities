public timedCommand(String cmd, String logFilePath) {
   timestamps {
      cmdOutput = sh (script:"${cmd}", returnStdout:true).trim()
   }
   echo cmdOutput
   writeFile file: "${logfilePath}", text: "${cmdOutput}"
}
return this;
