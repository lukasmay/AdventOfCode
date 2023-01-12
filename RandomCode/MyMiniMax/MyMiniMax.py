from math import inf as infinity
from random import choice
import platform
import time
from os import system


def num_Empty_Positions(state):
    count = 0
    i = 0
    cells = []
    for cell in state:
        if (cell == 0):
            count += 1
            
        i += 1
    return count


def evaluate(state):
    for cell in state:
        print("hi")