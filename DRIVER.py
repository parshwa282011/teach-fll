from pybricks.hubs import PrimeHub
from pybricks.pupdevices import Motor, ColorSensor, UltrasonicSensor, ForceSensor
from pybricks.parameters import Button, Color, Direction, Port, Side, Stop
from pybricks.robotics import DriveBase
from pybricks.tools import wait, StopWatch

hub = PrimeHub()
driveBase = None
def init(leftDriveMotor,rightDriveMotor, wheelDiameter, axleTrack):
    driveBase = DriveBase(leftDriveMotor,rightDriveMotor,wheelDiameter,axleTrack)

def forward(distance, distanceUnit):
    MMDistance = distance
    if distanceUnit != "MM":
        if distanceUnit == "CM":
            MMDistance = distance * 10
        if distanceUnit == "M":
            MMDistance = distance * 1000
        if distanceUnit == "IN":
            MMDistance = distance * 25.4
        if distanceUnit == "FT":
            MMDistance = distance * 304.8
    driveBase.straight(MMDistance,then=Stop.HOLD,wait=True)

def rotate(angle, angleUnit):
    DegAngle = angle
    if(angleUnit == "Rad"):
        DegAngle = angle * 57.2958
    driveBase.turn(DegAngle, then=Stop.HOLD, wait=True)

def curve(radius, radiusUnit, angle, angleUnit):
    MMRadius = radius
    DegAngle = angle
    if(angleUnit == "Rad"):
        DegAngle = angle * 57.2958
    if radiusUnit != "MM":
        if radiusUnit == "CM":
            MMRadius = radius * 10
        if radiusUnit == "M":
            MMRadius = radius * 1000
        if radiusUnit == "IN":
            MMRadius = radius * 25.4
        if radiusUnit == "FT":
            MMRadius = radius * 304.8
    driveBase.curve(MMRadius, DegAngle, then=Stop.HOLD, wait=True)