plugins {
    war
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.eclipse.microprofile:microprofile:3.3")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
