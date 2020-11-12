plugins {
    war
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.eclipse.microprofile:microprofile:3.3")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
