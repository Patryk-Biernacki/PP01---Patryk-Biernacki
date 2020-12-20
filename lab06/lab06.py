import random
from force_users import *


champions = [
    LightsaberUser("Jaden Korr"),
    LightSideForceUser("A'Sharad Hett"),
    LightSideForceUser("Aayla Secura"),
    DarkSideForceUser("Asajj Ventress"),
    JediMaster("Luke Skywalker"),
    SithLord("Emperor Palpatine"),
    SithLord("Darth Vader"),
]

numery = [];

for i in range(0, 10):
  numery.append(champions[random.randint(0, 6)]);

while len(numery) > 1:
    attacker = random.choice(numery)
    target = attacker

    while attacker == target:
        target = random.choice(numery)

    attacker.attack(target)
    if target.life_points <= 0:
        print(target.name + " died.")
        numery.remove(target)

print("")
print("The winner is " + numery[0].name)