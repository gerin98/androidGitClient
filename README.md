# Android Git Client
Search and Browse through GitHub repos with this helpful android app. Powered by the GitHub REST API, you can find any public repo hosted in GitHub!

## Table of Contents
**[1. Main Features](#main-features-bulb)**<br>
**[2. Api](#api-newspaper)**<br>
**[3. Getting Started](#getting-started-rocket)**<br>
**[4. Tech Stack](#tech-stack-hammer_and_wrench)**<br>
**[5. Credits](#credits-closed_book)**<br>
**[6. Author](#author-pencil2)**<br>
**[7. License](#license)**<br>

## Main Features :bulb:

#### Dark Mode :first_quarter_moon:
Supports both light and dark themes.

#### Search :mag:
Search by GitHub username to obtain all of their public repos.

#### Sorting :open_file_folder:
Sort results by alphabetical, most starred or most forked.

## Api :newspaper:
This project makes use of the [Github's API](https://docs.github.com/en/rest) to query for users and repos. 

## Getting Started :rocket:
Clone this repo to play with it yourself. 
```
git clone https://github.com/gerin98/androidGitClient.git
```
You can also download the APK directly here.

## Tech Stack :hammer_and_wrench:
- Language
  - [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- Architecture
  - [MVVM & Repository pattern](https://developer.android.com/jetpack/docs/guide#overview) - separate ui logic from business logic.
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - an observable lifecycle-aware data holder class.
  - [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - easily write code that interacts with views.
- Network
  - [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
  - [OkHttp](https://square.github.io/okhttp/) - an HTTP client that’s efficient by default.
- UI
  - [Databinding](https://developer.android.com/topic/libraries/data-binding) - bind UI components in your layouts to data sources in your app.
  - [Material Design](https://material.io/design) - a visual language that synthesizes the classic principles of good design with the innovation of technology and science.
  - [Icons](https://material.io/resources/icons/?style=baseline) - delightful, beautifully crafted symbols for common actions and items.
- Image loading
  - [Glide](https://github.com/bumptech/glide) - An image loading and caching library for Android focused on smooth scrolling.
## Credits :closed_book:

## Author :pencil2:

## License
