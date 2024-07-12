# Create an abstract class called Vehicle
import abc


class Vehicle(metaclass=abc.ABCMeta):
    # Create an abstract method called drive_direction()
    @abc.abstractmethod
    def drive_direction(self):
        pass


# Create another class Car that inherits from Vehicle
class Car(Vehicle):
    # the drive_direction() method in your Car should print "Drive forward"
    def drive_direction(self):
        print("Drive forward")


# Create another class Plane that inherits from Vehicle
class Plane(Vehicle):
    # drive_direction() in your Plane class should print "Drive Upward"
    def drive_direction(self):
        print("\nDrive Upward")


# instantiate the Car and Plane method
car = Car()
plane = Plane()

# Print the result of the drive_direction() mmethod.
car.drive_direction()
plane.drive_direction()
