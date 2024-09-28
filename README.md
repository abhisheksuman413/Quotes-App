# Quotes App

This Android app displays inspiring quotes from various authors. The app uses a JSON file stored in the app's assets folder to load quotes, providing users with the ability to navigate through quotes and share them with others.

## Features

- Displays a list of quotes with author names.
- Users can navigate between quotes using "Next" and "Previous" buttons.
- Allows users to share quotes with others using the share functionality.
- Clean and simple user interface for easy navigation.


## Screenshots
**𝐂𝐨𝐦𝐢𝐧𝐠 𝐒𝐨𝐨𝐧**

## Technologies Used

- **Kotlin** for Android app development.
- **ViewModel** to manage UI-related data in a lifecycle-conscious way.
- **Data Binding** for connecting UI components to data sources.
- **Gson** for parsing the quotes from a JSON file.
- **Retrofit** (if applicable for future API integration for dynamic quotes).

## Prerequisites

- Android Studio installed
- Basic knowledge of Android components like ViewModel, RecyclerView, and Data Binding.

## Architecture
### ViewModel
In Android, ViewModel is part of Jetpack's architecture components, designed to manage and store UI-related data in a lifecycle-aware way. It ensures that the data survives configuration changes like screen rotations.

In this app, the MainViewModel class:

- Stores the list of quotes and the current quote index.
- Fetches and holds quotes loaded from a JSON file.
- Provides functions for navigating between quotes (nextQuote(), previousQuote()) and sharing them.

By using ViewModel, even if the user rotates the device, the app remembers which quote was being displayed without resetting it, maintaining a seamless user experience.

### ViewModelFactory
ViewModelFactory is a class responsible for creating an instance of a ViewModel that requires arguments (such as a Context or Application object). Since the default ViewModelProvider cannot pass arguments to a ViewModel constructor, a custom ViewModelFactory is necessary.

In this app, MainViewModelFactory passes the Application context to the MainViewModel, allowing it to load quotes from the app's assets.


## Learn More

For more insights and a step-by-step guide on building this app, check out:
- **Medium Article:** [Link](https://medium.com/@abhisheksuman413/mastering-viewmodel-and-viewmodelfactory-building-a-robust-android-quotes-app-d69daf951ad7)

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/abhisheksuman413/Quotes-App
