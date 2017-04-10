public updateGradleProperties(String propertiesFile, String majorVersion, String minorVersion, String patchVersion, String buildStage) {

   sh "sed -i '/MAJOR_VERSION/c\\MAJOR_VERSION='${majorVersion} ${propertiesFile}"
   sh "sed -i '/MINOR_VERSION/c\\MINOR_VERSION='${minorVersion} ${propertiesFile}"
   sh "sed -i '/PATCH_VERSION/c\\PATCH_VERSION='${patchVersion} ${propertiesFile}"
   sh "sed -i '/BUILD_STAGE/c\\BUILD_STAGE='${buildStage} ${propertiesFile}"
}  
return this;


