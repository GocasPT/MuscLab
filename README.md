# MuscLab

MuscLab is an Android application built using **Kotlin** and **Jetpack Compose** designed to help fitness enthusiasts optimize their workout routines by visualizing muscle group activation and preventing overtraining.

## Overview

MuscLab addresses the common problem of muscle group repetition when performing multiple workouts in a single day and on consecutive days. The app helps users understand which muscle groups are being worked to avoid overworking the same areas and ensure balanced training sessions.

## Key Features

### Core Functionality
- **Exercise Selection**: Choose from a comprehensive list of exercises or create custom ones
- **Muscle Group Visualization**: Visual body map showing targeted muscle groups with color-coded intensity levels
- **Smart Conflict Detection**: Automatically identifies when multiple exercises target the same muscle groups
- **Workout Planning**: Plan multiple training sessions per day while avoiding muscle group conflicts

### Visual Feedback System
- **Red Zones**: Primary muscle activation (high intensity/fatigue)
- **Yellow Zones**: Secondary muscle activation (moderate intensity/support)
- **Automatic Escalation**: Yellow zones become red when multiple exercises target the same area
- **Untargeted Areas**: Clear visualization of muscle groups not being worked

### Exercise Management
- **Custom Exercise Creation**: Add new exercises and define their muscle group targets
- **Exercise Editing**: Modify existing exercises and their muscle group mappings
- **Smart Recommendations**: Get suggestions for exercises targeting underutilized muscle groups

## Use Cases

**Scenario**: You perform an arm workout in the morning and plan a leg workout later the same day. MuscLab will show you if tomorrow's scheduled workout includes arm exercises, helping you decide whether to modify today's training or tomorrow's plan.

**Benefits**:
- Prevent overtraining specific muscle groups
- Ensure balanced workout distribution
- Optimize recovery time between sessions
- Maximize training efficiency

## Technical Stack

- **Jetpack Compose**: Modern declarative UI toolkit for native Android development
- **Material 3 Design**: Latest Material Design components and theming system
- **Kotlin**: Primary development language
- **Edge-to-Edge UI**: Immersive full-screen experience with system UI integration

## Getting Started

### Prerequisites

- Android Studio Meerkat | 2024.3.1 Patch 1 or later
- Gradle 8.0 or later
- Android SDK 21 or higher (Android 5.0+)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/GocasPT/musclab.git
   ```
2. Open the project in Android Studio
3. Sync the Gradle files
4. Run the app on an emulator or physical device

## Project Structure

```
app/
├── src/main/java/dev/gocas/musclab/
│   ├── ui/
│   │   ├── components/          # Reusable UI components
│   │   ├── screens/             # Main app screens
│   │   └── theme/               # Material 3 theming
│   ├── data/
│   │   ├── models/              # Exercise and muscle group models
│   │   └── repository/          # Data management
│   └── utils/                   # Helper functions
```

## Usage

1. **Select Exercises**: Choose from the exercise library or add custom exercises
2. **View Muscle Activation**: See which muscle groups will be targeted with color-coded intensity
3. **Check Conflicts**: Review overlapping muscle group usage across exercises
4. **Plan Optimally**: Use recommendations to balance your workout routine

## Contributing

We welcome contributions! Please feel free to submit issues, feature requests, or pull requests to help improve MuscLab.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

*MuscLab - Train Smart, Not Hard*
