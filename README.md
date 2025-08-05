# Jenkins Testing - ANT Spring MVC Project 🚀

A comprehensive DevSecOps demonstration project showcasing CI/CD pipeline integration with Jenkins, SonarQube code analysis, and Apache Ant build automation for Spring MVC web applications.

## 📋 Project Overview

This repository demonstrates modern DevSecOps practices by integrating:
- **Apache Ant** build automation
- **Spring MVC** web framework
- **Jenkins** CI/CD pipeline
- **SonarQube** static code analysis
- **JUnit** unit testing
- **JaCoCo** code coverage reporting

## 🏗️ Project Structure

```
Jenkins-Testing/
├── AntSpringMVC/              # Main Spring MVC application
│   ├── build.xml              # Apache Ant build configuration
│   ├── war/                   # Web application structure
│   │   └── WEB-INF/          # Web application configuration
│   ├── report/                # Test and coverage reports
│   └── target/                # Build output directory
├── sonar-project.properties   # SonarQube analysis configuration
└── README.md                  # Project documentation
```

## 🛠️ Technologies Used

- **Build Tool**: Apache Ant with Ivy dependency management
- **Framework**: Spring MVC
- **Java Version**: JDK 1.8
- **Testing**: JUnit 4.11
- **Code Coverage**: JaCoCo
- **Static Analysis**: SonarQube
- **CI/CD**: Jenkins
- **Package Format**: WAR (Web Archive)

## 🚀 Getting Started

### Prerequisites

- Java JDK 1.8 or higher
- Apache Ant 1.9+
- Apache Ivy (for dependency management)
- Jenkins (for CI/CD)
- SonarQube (for code analysis)

### Installation & Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/hackerassociate/Jenkins-Testing-ANT-Project-DevSecOpS.git
   cd Jenkins-Testing-ANT-Project-DevSecOpS
   ```

2. **Install Ivy (if not already installed)**:
   ```bash
   cd AntSpringMVC
   ant ivy
   ```

3. **Resolve dependencies**:
   ```bash
   ant resolve
   ```

## 🔧 Build Commands

### Core Build Tasks

```bash
# Navigate to the AntSpringMVC directory
cd AntSpringMVC

# Clean previous builds
ant clean

# Compile source code
ant compile

# Run unit tests
ant junit

# Generate code coverage report
ant jacoco

# Create WAR package
ant package

# Complete build (default target)
ant main
```

### Available Ant Targets

| Target | Description |
|--------|-------------|
| `clean` | Remove build artifacts and temporary files |
| `init` | Initialize project directories |
| `resolve` | Download dependencies using Ivy |
| `compile` | Compile Java source code |
| `copy-resources` | Copy XML and properties files |
| `junit` | Execute JUnit tests |
| `jacoco` | Generate code coverage reports |
| `package` | Create deployable WAR file |
| `main` | Default target - complete build process |

## 📊 Quality Assurance & DevSecOps

### SonarQube Integration

The project includes comprehensive SonarQube configuration for:
- **Code Quality Analysis**
- **Security Vulnerability Detection**
- **Code Coverage Reporting**
- **Technical Debt Assessment**

**Run SonarQube Analysis**:
```bash
# Ensure SonarQube server is running
sonar-scanner
```

### Key SonarQube Metrics Tracked:
- Code Coverage (JaCoCo integration)
- Duplicated Lines
- Maintainability Rating
- Security Rating
- Reliability Rating
- Technical Debt

## 🔄 Jenkins CI/CD Pipeline

This project is designed to integrate seamlessly with Jenkins for continuous integration and deployment:

### Pipeline Stages:
1. **Source Code Checkout**
2. **Dependency Resolution** (`ant resolve`)
3. **Compilation** (`ant compile`)
4. **Unit Testing** (`ant junit`)
5. **Code Coverage** (`ant jacoco`)
6. **Static Code Analysis** (SonarQube)
7. **Package Creation** (`ant package`)
8. **Deployment** (to target environment)

### Jenkins Setup:
1. Create a new Jenkins job
2. Configure SCM to point to this repository
3. Add build step: `ant main`
4. Configure SonarQube scanner
5. Archive test results and coverage reports

## 📈 Testing & Coverage

### Unit Testing
- Framework: JUnit 4.11
- Test reports: Generated in `report/` directory
- Formats: XML and plain text

### Code Coverage
- Tool: JaCoCo
- Output: `target/jacoco.exec` and `target/jacoco.xml`
- Integration: SonarQube compatible reports

## 📦 Deployment

The build process generates a deployable WAR file:
- **Location**: `target/helloproject.war`
- **Format**: Standard Java Web Archive
- **Deployment**: Compatible with any Java servlet container (Tomcat, Jetty, etc.)

## 🔒 Security & DevSecOps Features

- **Static Application Security Testing (SAST)** via SonarQube
- **Dependency vulnerability scanning**
- **Code quality gates** for security standards
- **Automated security reporting** in CI/CD pipeline

## 📋 Configuration Files

### `build.xml`
Apache Ant build configuration with:
- Ivy dependency management
- Compilation settings
- Test execution
- Code coverage integration
- WAR packaging

### `sonar-project.properties`
SonarQube analysis configuration:
- Project identification
- Source and test directories
- Coverage report paths
- Quality gate settings

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 Best Practices Demonstrated

- **Automated Build Process**: Complete automation with Ant
- **Test-Driven Development**: Comprehensive unit testing
- **Code Quality**: SonarQube integration for quality gates
- **Security Integration**: SAST tools in CI/CD pipeline
- **Documentation**: Comprehensive project documentation
- **Version Control**: Git-based workflow with proper branching

## 🏷️ Tags

`#DevSecOps` `#DevOps` `#Jenkins` `#ApacheAnt` `#SpringMVC` `#SonarQube` `#Java` `#CI/CD` `#JUnit` `#JaCoCo` `#SAST` `#Security` `#QualityAssurance` `#BuildAutomation`

## 📞 Support

For questions, issues, or contributions, please:
- Open an issue in this repository
- Contact the maintainer: [hackerassociate](https://github.com/hackerassociate)

---

**Built with ❤️ for DevSecOps Excellence**
