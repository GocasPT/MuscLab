# MuscLab

**Train Smart, Not Hard** | A comprehensive Android application that revolutionizes fitness training through intelligent muscle engagement analysis and overtraining prevention.

## Overview

MuscLab empowers fitness enthusiasts, personal trainers, and rehabilitation patients with advanced muscle impact visualization technology. By combining exercise selection with real-time muscle engagement analysis, the app prevents overtraining while ensuring balanced workout routines that maximize results and minimize injury risk.

## ✨ Key Features

### 🧠 Intelligent Analysis System
- **Real-Time Muscle Visualization**: Interactive body mapping with color-coded intensity levels
- **Overtraining Prevention**: Instant alerts for muscle overload with visual warnings
- **Multi-Exercise Impact Analysis**: See cumulative muscle engagement across multiple exercises
- **Recovery Guidance**: Personalized recovery time recommendations based on workout intensity

### 🎯 Visual Feedback Technology
- **Dynamic Body Mapping**: Interactive human anatomy diagram with precise muscle zone targeting
- **Color-Coded System**: 
  - 🔴 **Red Zones**: Primary muscle activation (high intensity)
  - 🟡 **Yellow Zones**: Secondary muscle activation (moderate support)
  - ⚫ **Gray Areas**: Untargeted muscle groups
- **Automatic Escalation**: Yellow zones become red when multiple exercises target the same area
- **Overload Alerts**: Clear visual warnings for muscles requiring recovery

### 📊 Comprehensive Workout Management
- **Custom Exercise Creation**: Build personalized exercise library with muscle zone mapping
- **Workout Planning**: Multi-day training session planning with conflict detection
- **History Tracking**: Detailed workout logs with progress analytics
- **Template System**: Create and save reusable workout routines
- **Calendar Integration**: Schedule workouts with visual muscle load distribution

### 🌐 Community & Sharing
- **Workout Export**: Share routines via links or QR codes
- **Community Library**: Access and rate workouts from other users
- **Import System**: Seamlessly integrate shared workout plans
- **Progress Sharing**: Export workout achievements and muscle development data

## 🎯 Use Cases

### For Personal Trainers
Create client-specific routines with visual muscle engagement balance, ensuring optimal training distribution and preventing overuse injuries.

### For Rehabilitation Patients
Monitor muscle recovery by avoiding overloaded zones, following safe progressive overload principles with visual feedback.

### For Fitness Enthusiasts
Discover exercise combinations targeting neglected muscle groups, optimize training efficiency, and achieve balanced physique development.

### For Beginners
Learn proper muscle engagement through intuitive visual feedback, understand exercise impact, and build confidence in workout planning.

## 🏗️ Technical Architecture

### Core Technologies
- **Language**: Kotlin with coroutines for asynchronous operations
- **UI Framework**: Jetpack Compose with Material Design 3
- **Architecture**: MVVM (Model-View-ViewModel) pattern
- **Navigation**: Compose Navigation with type-safe arguments
- **Database**: Room for local persistence with migration support

### Advanced Features
- **Muscle Load Algorithms**: Proprietary calculations for cumulative muscle impact
- **Edge-to-Edge UI**: Immersive full-screen experience with system UI integration
- **Responsive Design**: Adaptive layouts for various screen sizes
- **Performance Optimization**: Lazy loading and efficient state management

## 🚀 Getting Started

### Prerequisites
- **Android Studio**: Meerkat | 2024.3.1 Patch 1 or later
- **Android SDK**: API Level 26+ (Android 8.0+)
- **Gradle**: 8.0 or later
- **Kotlin**: 1.9.0+
- **JDK**: 11 or higher

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/GocasPT/musclab.git
   cd musclab
   ```

2. **Setup Development Environment**
   ```bash
   # Open in Android Studio
   # File → Open → Select musclab directory
   ```

3. **Sync Dependencies**
   ```bash
   # Android Studio will automatically prompt for Gradle sync
   # Click "Sync Now" when prompted
   ```

4. **Build and Run**
   ```bash
   # Use Android Studio Run button (Shift + F10)
   # Or via command line:
   ./gradlew assembleDebug
   ```

## 📁 Project Structure

```
app/src/main/java/dev/gocas/musclab/
├── ui/
│   ├── components/              # Reusable UI components
│   ├── screens/                # Main application screens
│   └── theme/                  # Material 3 theming system
├── data/
│   ├── models/                 # Data structures
│   ├── database/               # Room database
│   └── repository/             # Data management layer
└── utils/                      # Helper functions and algorithms
```

## 🤝 Contributing

We welcome contributions from the fitness and development communities! Whether you're fixing bugs, adding features, or improving documentation, your help makes MuscLab better for everyone.

### How to Contribute
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Development Guidelines
- Follow Kotlin coding conventions
- Use Jetpack Compose best practices
- Write meaningful commit messages
- Include tests for new features
- Update documentation as needed

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
