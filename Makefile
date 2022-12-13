b: build
build: build-maven build-gradle
build-maven:
	mvn clean install
build-gradle:
	cd jeorg-kotlin-apps/jeorg-microchip-maker/jeorg-microchip-maker-gui && gradle wrapper && gradle build test
	cd jeorg-kotlin-crums/jeorg-kotlin-crums-4 && gradle wrapper && gradle build test
build-chip-maker:
	cd jeorg-kotlin-apps/jeorg-microchip-maker && mvn clean install
	cd jeorg-kotlin-apps/jeorg-microchip-maker/jeorg-microchip-maker-gui && gradle build test
