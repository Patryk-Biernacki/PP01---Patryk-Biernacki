import random

class Defence(object):
      def __init__(self, defence):
        self.defence = defence;


class ForcePower(object):
    def __init__(self, name, damage):
        self.name = name
        self.damage = damage

    def __str__(self):
        return self.name + ": " + str(self.damage)


class ForceUser(object):
    life_points = 100
    available_movements = []

    def __init__(self, name):
        self.name = name
        self.available_movements = []

    def attack(self, opponent):
        drawnMovement = random.choice(self.available_movements)
        opponent.life_points -= drawnMovement.damage+random.randint(-10, 10)+opponent.defence

        print(self.name + " attacks " + opponent.name + " with " + drawnMovement.name + ".")
        print(opponent.name + " now has " + str(opponent.life_points) + " life points.")


class LightsaberUser(ForceUser, Defence):
    def __init__(self, name):
        super(LightsaberUser, self).__init__(name)

        self.available_movements.extend([
            ForcePower("Lightsaber Attack", 10),
            ForcePower("Lightsaber Throw", 15)
        ])
        self.defence = 1
  

class LightSideForceUser(ForceUser, Defence):
    def __init__(self, name):
        super(LightSideForceUser, self).__init__(name)

        self.available_movements.extend([
            ForcePower("Mind Trick", 5)
        ])
        self.defence = 2



class JediMaster(LightsaberUser, LightSideForceUser, Defence):
    def __init__(self, name):
        super(JediMaster, self).__init__(name)

        self.available_movements.extend([
            ForcePower("Force Light", 35),
        ])
        self.defence = 3



class DarkSideForceUser(ForceUser, Defence):
    def __init__(self, name):
        super(DarkSideForceUser, self).__init__(name)

        self.available_movements.extend([
            ForcePower("Force Grip", 15),
            ForcePower("Force Lightning", 15)
        ])
        self.defence = 4


class SithLord(LightsaberUser, DarkSideForceUser, Defence):
    def __init__(self, name):
        super(SithLord, self).__init__(name)

        self.available_movements.extend([
            ForcePower("Force Rage", 30),
        ])        
        self.defence = 5
