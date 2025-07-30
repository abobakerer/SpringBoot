## 🟢 GreetingController

- A simple controller that returns a greeting message.
- Endpoint: `GET /`
- Response: `"Hello, SpringBoot!"`

![GreetingController](https://github.com/user-attachments/assets/d8e56b1c-c15d-4a83-9607-c09ad2a17e7a)

---

## 🔧 Exclude DataSource Auto Configuration

- When using:
  ```java
  @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
  ```
  Spring Boot will **not try to auto-configure a datasource** (like H2).
- This is useful if your application doesn't require a database.

- Updated `Main.java`:

![Main.java](https://github.com/user-attachments/assets/d901ecf9-ca76-44d4-ac39-d228fa5d951e)

---

## ⚙️ Configuration Properties with Profiles

- Added `application.properties`:

  ```properties
  app.title=Default Title
  ```

- Added `application-dev.yml`:

  ```yaml
  app:
    title: Dev Title
  ```

- Created an endpoint to fetch the configured title value.

![application.properties](https://github.com/user-attachments/assets/f60e0844-c0b5-4191-8287-4e2af6cf9f24)
![GetTitle endpoint](https://github.com/user-attachments/assets/f58645f8-135a-4698-9396-267d1d2fda59)

---

## 🕒 TimeService Interface and Implementations

- Created an interface `TimeService`.
- Two implementations:

  - `SystemTimeService` (uses current system time)
  - `MockTimeService` (returns fixed/mock time)

- ✅ Spring will throw an error if multiple beans implement an interface **unless**:

  - You mark one with `@Primary`
  - Or specify a `@Qualifier`

- In this case:
  - `@Primary` was used on `SystemTimeService`
  - `@Qualifier("mock")` used in controller to specify the mock implementation

---

## 🔹 TimeController

- Injects `TimeService` using constructor injection.
- Uses `MockTimeService` explicitly with `@Qualifier`.

![TimeController](https://github.com/user-attachments/assets/e779cd26-538a-472b-ad17-37ccc939f374)
![GetTime endpoint](https://github.com/user-attachments/assets/6b85d0a3-315f-43f9-bfd9-143bd40eb868)

---
