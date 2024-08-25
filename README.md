
# Retrofit Ex - Mars Photo App

This is an example Android project demonstrating the use of Retrofit for networking and Jetpack Compose for UI in a Kotlin application. The app fetches photos from a remote server and displays them in a grid format.

## Project Overview

- **Kotlin**: Programming language used for development.
- **Jetpack Compose**: UI toolkit for building native Android UIs.
- **Retrofit**: Type-safe HTTP client for Android and Java.
- **Coil**: Image loading library for Jetpack Compose.

## Features

- Fetches a list of photos from a remote server using Retrofit.
- Displays photos in a grid layout using Jetpack Compose.
- Handles loading and error states gracefully.

## Setup

### Requirements

- Android Studio (latest stable version)
- JDK 11 or higher

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/retrofit-example.git
   ```

2. **Open the project in Android Studio:**

   - Open Android Studio and select "Open an existing project."
   - Navigate to the directory where you cloned the repository and open it.

3. **Sync Gradle:**

   - Android Studio should prompt you to sync Gradle. Click "Sync Now" to resolve dependencies.

4. **Run the Application:**

   - Connect an Android device or start an emulator.
   - Click the "Run" button in Android Studio to build and run the application.

## Code Overview

- **Data Class (`PhotoData`)**: Represents the photo data with `id`, `img_src`, and `selected` properties.
- **ViewModel (`MarsViewModel`)**: Handles data fetching and UI state management.
- **API Service (`MarsApiService`)**: Defines the Retrofit service interface for fetching photos.
- **UI (`MainActivity`, `HomeScreen`, `ResultScreen`, `ErrorScreen`, `LoadingScreen`)**: Composes the user interface to display the photos and handle different states.

## API Endpoints

- **GET `/photos`**: Fetches a list of photos. The response is a list of `PhotoData` objects.

## Troubleshooting

- **Network Issues**: Ensure that your device or emulator has internet access.
- **Build Errors**: Verify that you have all required dependencies and sync Gradle.

