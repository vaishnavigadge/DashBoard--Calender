# DashBoard--Calender

Selenium + TestNG UI tests for [Digibility](https://testapp.digibility.ai).

## Prerequisites

- **JDK 17+** (install with `winget install EclipseAdoptium.Temurin.17.JDK`)
- **Google Chrome** (Selenium 4 downloads ChromeDriver automatically)
- Maven is **optional** — this project includes the Maven Wrapper (`mvnw`)

After installing Java, **close and reopen PowerShell** (or Cursor’s terminal) so `java` is on your PATH.

## Run all tests

From the project folder, use the wrapper (no global `mvn` required):

```powershell
cd C:\Users\rst_r\gitprojects\vaishnavi\DashBoard--Calender
.\mvnw.cmd test
```

If you installed Maven and added it to PATH, you can also run:

```powershell
mvn test
```

Compile only (no browser tests):

```powershell
.\mvnw.cmd test-compile
```

## Project layout

```
src/test/java/hi/     Test classes
src/test/resources/   testng.xml suite
pom.xml               Dependencies and Surefire config
mvnw.cmd              Maven Wrapper (Windows)
```

## Test classes

| Class | Tests |
|-------|--------|
| `hi.Digibility` | `loginData`, `click`, `method` |
| `hi.LoginPage` | `loginData`, `post` |
| `hi.Billing` | `billingFlow` |
| `hi.DashboardCalendarTest` | `dashboardCalendarFlow` |

## Troubleshooting

| Error | Fix |
|-------|-----|
| `mvn` is not recognized | Use `.\mvnw.cmd test` instead of `mvn test` |
| `java` is not recognized | Install JDK 17+, then open a **new** terminal |
| Tests fail on login/UI | Site or selectors may have changed; tests need a live network and valid credentials |
