# Video Rental System

A basic Java console-based application to manage a video rental store.

## ✨ Features

- Add videos to the store
- Rent a video
- Return a video
- Check video availability
- Rate videos

---

## 🧠 Concepts Used

### 🔹 Object-Oriented Programming (OOP)
- **Classes and Objects**: `Video`, `VideoStore`, and `VideoLauncher`
- **Encapsulation**: Fields like `checkedOut`, `rating`, and `title` are private with public methods for access/modification.
- **Abstraction**: Details of video management (e.g., renting and returning) are hidden inside the `VideoStore` class.
- **Modular Design**: Each class is responsible for its own part of the system (Single Responsibility Principle).

### 🔹 Java Core Concepts
- **Arrays / Lists**: Managing a collection of video objects.
- **Loops & Conditionals**: For menu navigation and user interaction.
- **Static methods**: For managing program flow in `VideoLauncher`.
- **Scanner class**: For taking user input from the console.
- **Error handling / Validation**: (Basic level – e.g., checking if video exists)

---

## 📂 Files

| File Name            | Description                                                |
|----------------------|------------------------------------------------------------|
| `Video.java`         | Defines the `Video` class (title, rating, checkout status) |
| `VideoStore.java`    | Manages a collection of videos                             |
| `VideoLauncher.java` | Main class to interact with the system via console         |

---

## 🚀 How to Run

1. Compile all `.java` files:
   ```bash
   javac Video.java VideoStore.java VideoLauncher.java
