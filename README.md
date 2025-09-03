# Citizen Records Simulator (INEGI Simulation)

---

## Project Overview

This project simulates an automated system for generating, storing, and analyzing citizen records, similar to what an institution like **INEGI** (Mexico's national statistics agency) might use.

It consists of three main modules:

1. **Automatic record generator**
2. **Text-based analysis interface**
3. **Graphical data visualization**

---

## What Does It Do?

### Record Generator (`Registros.java`)
- Generates random records every second containing:
  - Simulated CURP (Mexican ID)
  - Gender (`H` = Male, `M` = Female)
  - Federal entity (state)
  - Education level
- Stores each record in a text file using the `Archivo` class.

### Text Interface (`interfazTexto.java`)
A command-line menu that allows users to:
1. Display the total number of records by gender.
2. Display the number of records per federal entity (state).
3. Display how many people have a certain education level, separated by gender.
4. Calculate the average age of people by education level.
5. Exit the program.

### Graphical Visualization (`graficaBarras.java`)
- Shows a bar graph representing the number of citizens per education level.
- The chart updates every 3 seconds automatically.

---

## How to use it
Please reproduce the proyecto3.mp3 video. It explains how to run and use the project.
