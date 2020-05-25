# Virtual Pet Shelter

A Virtual Pet Shelter game is a no-frills application that was written as a means to practice basic Java principles: creating classes, instances, loops, methods. 
Also an attempt was made to write code that is focused, easy to read and understand, can evolve and is reusable. 
Functionality is very bare-bones, so you will not find any exception handling or user input checks.

Application consists of three classes: VirtualPet, Virtual PetShelter, and VirtualPetShelterApp.
VirtualPet class sets attributes that a Virtual Pet will have in the game, instances of this class will be created initialy and through user interaction.
VirtualPetShelterApp class contains the Main method and the game loop. Also, user interaction and most of console output methods are placed in this class.
VirtualPetShelter class initializes a Map that will contain all virtual pets, initially creates two VirtualPet objects and adds them to the Map. 
Also this class contains the Tick method that advances the game, and methods that define what each interaction with a Virtual Pet object will do, as well as methods that query the Map.
There is also a method that displays status of all Virtual Pets in shelter after every pet interaction.

The game's objective is to maintain a Virtual Pet Shelter by adding pets to shelter, giving pets up for adoption and interacting with Virtual Pets in shelter without allowing any of their needs to reach 20 points.
All Virtual Pets start out with their needs at 5 points, and users can interact with them by feeding, watering, playing with them, and giving them bathroom breaks via keyboard inputs. 
An interaction (feeding, giving water, etc.) reduces that particular need's value by a strategic number of points, but at the same time a game loop adds 1 point to all needs.

On top of that, some interactions adds points to other needs, for example feeding a pet makes hunger go down by 3 points, but makes Boredom and Bathroom Break go up by 1 point. 
Along the way, users are able to give a pet up for adoption, or take in a new pet. Once all pets are adopted, the game will end displaying a congratulatory message.

The game is a balancing act of feeding, watering, playing with and giving bathroom brakes to your Virtual Pets to make sure none of their needs reach 20. 
When that happens, you are asked to leave the Virtual Pet Shelter and the game ends. 
