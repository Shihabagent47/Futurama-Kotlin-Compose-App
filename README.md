![futurama_sample1](https://github.com/user-attachments/assets/4c923a4d-9f93-461a-bfd6-05f72167d54c)
Futurama App
Overview
The Futurama App is a sleek and modern application built using Jetpack Compose and the MVVM architecture. It provides fans of the popular TV show Futurama with detailed information about characters, episodes, and other exciting content.

Features
🛸 Explore all Futurama characters with detailed profiles.
📺 Browse episodes and their summaries.
🚀 Search for your favorite characters or episodes.
🌌 Responsive and modern UI built with Jetpack Compose.
🧑‍💻 Clean and maintainable codebase following MVVM architecture principles.
Tech Stack
Language: Kotlin
UI Framework: Jetpack Compose
Architecture: MVVM (Model-View-ViewModel)
Networking: Retrofit + Coroutines
Dependency Injection: Hilt
State Management: StateFlow
Image Loading: Coil
Screenshots

Installation
Clone the repository:
bash
Copy code
git clone https://github.com/your-username/futurama-app.git
cd futurama-app
Open the project in Android Studio.
Build and run the app on an emulator or physical device.
How It Works
The app uses Retrofit to fetch data from a Futurama API.
ViewModel manages the UI state and interacts with the repository layer.
Jetpack Compose renders the UI, providing a reactive and declarative user interface.
Project Structure
bash
Copy code
📂 futurama-app
├── 📂 data         # Data layer (API, models, repositories)
├── 📂 ui           # UI layer (Compose screens, components)
├── 📂 viewmodel    # ViewModel layer (business logic, state handling)
├── 📂 di           # Dependency Injection setup
└── 📂 utils        # Utility classes and helpers
Contributing
Contributions are welcome! Please follow these steps:

Fork the repository.
Create a new branch (feature/your-feature-name).
Commit your changes.
Push to your fork and submit a pull request.
License
This project is licensed under the MIT License. See the LICENSE file for details.
