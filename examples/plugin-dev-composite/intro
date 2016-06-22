# Composite build to develop a Gradle plugin

This sample demonstrates a composite build used to develop a Gradle plugin in conjunction with a consuming build. This plugin can then easily be published to be shared with other Gradle builds.

This setup removes the need for a `buildSrc` project for developing a plugin.

### Important note:

This use case is not currently fully functional.

Changes to the plugin _implementation_ are picked up automatically by the consumer build.

Changes to the _API_ of the plugin are not available to the consumer build, without publishing these changes to the local repository. The reason is that we fully configure each build independently before executing the requested task in the composite: configuring the consumer build fails because it does not have access to the modified plugin classpath at this stage.
