# Pocket Guidance 

A personal budgeting Android app built with Kotlin, Room DB, and MPAndroidChart.

![Android](https://img.shields.io/badge/Android-3DDC84?style=flat&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat&logo=kotlin&logoColor=white)
![CI](https://github.com/tirisanomolaolwe-byte/Pocket-Guidance-2/actions/workflows/android_ci.yml/badge.svg)

 **[Watch the full app demo on YouTube](https://youtu.be/v5Hv45jkJYw)**

 ![Login and Signup](https://github.com/user-attachments/assets/8499aed8-985a-4d62-80f2-f811ee3d81ad)

Pocket Guidance
What the App Does and Who It Is For

Pocket Guidance is a personal finance management application designed to help users track their income, expenses, budgets, savings goals, and overall financial wellbeing.

The application is intended for students, young professionals, and individuals who want a simple way to manage their finances and make informed spending decisions. Users can record transactions, categorize expenses, monitor spending habits, create budgets, set savings goals, and view financial reports through an intuitive mobile interface.

The aim of the application is to encourage responsible money management by providing visual insights into spending behaviour and financial progress. 

Design Decisions

Several design decisions were made to improve usability and accessibility:

Clean Dashboard Layout

The dashboard serves as the central hub of the application and provides quick access to major features through Quick Action cards. This reduces the number of steps required to perform common tasks.

Card-Based User Interface

CardViews were used throughout the application to create a modern and organized layout. This improves readability and separates different financial components visually.

Financial Visualisation

Charts were incorporated to help users better understand their financial data:

Pie Chart for Spending by Category
Bar Chart for Income vs Expenses vs Balance
Spending Insights section for personalised financial feedback

Financial Visualisation

Charts were incorporated to help users better understand their financial data:

Pie Chart for Spending by Category
Bar Chart for Income vs Expenses vs Balance
Spending Insights section for personalised financial feedback

Bottom Navigation

A Bottom Navigation Bar was implemented to allow users to move quickly between major sections of the application without repeatedly returning to the dashboard.

User Preferences

The application supports user-specific settings such as currency selection and dark mode preferences to improve user experience.

Use of GitHub and GitHub Actions
GitHub

GitHub was used as the primary version control platform throughout development.

GitHub provided:

Source code management
Branch management
Commit history tracking
Collaboration between team members
Backup of project files

Regular commits were made to document progress and maintain a clear development history.

GitHub Actions

GitHub Actions was used to automate build verification whenever code was pushed to the repository.

The workflow automatically:

Checks out the repository
Sets up Java
Builds the Android project
Detects compilation errors before deployment

This helped maintain code quality and ensured that updates did not break the application.

## Features

### Core Requirements
- **Register & Login** — secure username/password authentication with local Room DB
- **Categories** — create custom spending categories with monthly limits (e.g. Groceries, Transport)
- **Add Expense** — log expenses with amount, date, description, category, and optional receipt photo
- **View Expenses** — filterable list by user-selectable date range; tap any entry to view its receipt photo
- **Category totals** — see total spent per category over any user-selected period
- **Min/Max Budget Goals** — set a minimum and maximum monthly spending goal
- **Reports & Graph** — bar chart showing amount spent per category over a selectable period, with min and max goal lines clearly overlaid. Line chart shows 6-month spending trend.
- **Visual Goal Tracker** — progress bar on the Reports screen showing exactly where current spending sits between the min and max goals. Overspending is highlighted in red.
- **Gamification** — 7 unlockable badges awarded automatically for milestones: first transaction, 10+ transactions, staying under budget, spending under R1,000, using 5+ categories, 7-day streak, and 30-day streak


## Project Custom Features

#### 1.  Spending Insights
Automatically generated tips displayed on the Dashboard, comparing this month's spending per category against last month. Examples:
- "Transport spending is up 80% vs last month"
- "Great! Food spending is down 40% vs last month"
- "You've exceeded your monthly budget of R2,000"

This feature helps users identify trends without needing to navigate to the Reports screen.

#### 2.  CSV Export
Export your full transaction list (filtered by date range) to a `.csv` file directly from the Transactions screen. The file can be opened in Google Sheets, Microsoft Excel, or any spreadsheet app. Each row includes: Date, Type, Category, Description, Amount, and whether a receipt photo was attached.

Custom Features
Custom Feature 1: Quick Actions Dashboard

The Quick Actions Dashboard provides users with a fast and convenient way to access frequently used features directly from the home screen.

Features available through Quick Actions include:

Add Expense
Transactions
Budgets
Goals
Categories
Profile
Earn and Learn
Reports

This feature improves navigation efficiency by reducing the number of screens users must visit to access important functionality.

Benefit

Users can perform common financial management tasks with a single tap, improving overall usability and user experience.

Custom Feature 2: Spending Insights System

The Spending Insights System analyses user transaction data and generates personalised financial feedback.

The system compares:

Current month spending
Previous month spending
Category spending patterns
Monthly spending goals

Examples of generated insights include:

Notifications when spending increases significantly
Warnings when spending exceeds monthly goals
Identification of highest spending categories
Positive feedback when spending decreases
Benefit

This feature helps users understand their financial habits and encourages better spending decisions through data-driven recommendati
---

## Tech Stack

| Layer | Technology |

| Language | Kotlin |
| UI | XML layouts + ViewBinding |
| Database | Room (SQLite) |
| Charts | MPAndroidChart |
| Architecture | Repository pattern + coroutines/Flow |
| Auth | Local Room-based auth with SessionManager |
| CI | GitHub Actions |


---

## Running Tests

```bash
./gradlew test
```

Test reports are saved to `app/build/reports/tests/`.

---

## GitHub Actions CI

Every push and pull request to `main`, `master`, or `develop` automatically:
- Runs all unit tests
- Builds a debug APK
- Uploads test results and the APK as build artifacts

## Team
Katlego Kwakwari (ST1044080) - Backend / Database Engineer
Phumudzo Munyai(ST10450008) - UI/UX Developer
Katlego Makhuba(ST10366193)- Logic / ViewModel Engineer
Tirisano Molaolwe(ST10455374)- DevOps / Integration

Group project.2026.
