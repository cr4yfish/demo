# Java Development Environment Test Setup
This repository contains a simple Java project that can be used to test the setup of a Java development environment.

## Tech Stack
* Spring
* Docker

## Prerequisites
* Docker
* A computer

## Setup
1. Clone the repository
```
gh repo clone cr4yfish/java_spring_docker_test
```

2. Build the image in the root directory of the repository
```sh
docker build --tag java-docker .
```

## Known Issues
* "mvnw" has to have Linux line endings, or else docker will not be able to execute it.