[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/beryx-gist/badass-jlink-example-hello-db-single-project/blob/main/LICENSE)
[![Build Status](https://img.shields.io/github/workflow/status/beryx-gist/badass-jlink-example-hello-db-single-project/jlinkAll)](https://github.com/beryx-gist/badass-jlink-example-hello-db-single-project/actions?query=workflow%3A%22jlinkAll%22)


## Badass JLink Plugin Example: hello-db-single-project ##

See [issue #179](https://github.com/beryx/badass-jlink-plugin/issues/179)

A small JavaFX application that shows how to use the [Badass JLink Plugin](https://github.com/beryx/badass-jlink-plugin) to create two jlink images of the same application, but each with a different runtime classpath.

For a multi-project solution see [hello-db-multi-project](https://github.com/beryx-gist/badass-jlink-example-hello-db-multi-project).

This solution creates a task named `jlinkAll`, which uses a GradleRunner to execute the `jlink` task twice, with different properties.

### Usage
**Creating the custom runtime images:**
```
./gradlew jlinkAll
```

The images will be created in the directories `build/image-h2` and `build\image-hsqldb`.
