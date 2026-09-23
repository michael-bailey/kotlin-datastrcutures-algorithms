plugins {
	kotlin("jvm") version "2.4.10"
}

group = "net.michael-bailey"
version = "1.0-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	testImplementation(kotlin("test"))
	testImplementation("org.junit.jupiter:junit-jupiter:5.14.0")
}

kotlin {
	jvmToolchain(25)
}

tasks.test {
	useJUnitPlatform()
}