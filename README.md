# Phrase

A simple Java application that uses the [prose-builder](https://github.com/bs-jokri/prosebuilder) library to generate prose from sentences.

Built as part of a university project at HTW Berlin to learn OSS implementations.

---

## Project Structure

```
src/
└── main/
    └── java/
        └── phrase/
            ├── Main.java          # Entry point
            ├── Statement.java     # Implements Sentence — adds a period
            └── Shout.java         # Implements Sentence — adds an exclamation mark
```

---

## Requirements

- Java 21
- Maven

---

## Setup

**1. Clone the repository**
```bash
git clone https://github.com/YadiSphere/phrase.git
cd phrase
```

**2. Add GitHub credentials to `~/.m2/settings.xml`**
```xml
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>YOUR_GITHUB_USERNAME</username>
      <password>YOUR_PERSONAL_ACCESS_TOKEN</password>
    </server>
  </servers>
</settings>
```

**3. Build the project**
```bash
mvn clean install
```

---

## Run

```bash
mvn exec:java -Dexec.mainClass="phrase.Main"
```

**Example output:**
```
The sky is blue. What a beautiful day!
```

---

## Tests

```bash
mvn test
```

Tests cover the `get()` method of both `Statement` and `Shout`.

---

## License

MIT License — see [LICENSE](https://github.com/YadiSphere/phrase/blob/master/LICENSE.md) for details.

---
## Contributing Guidelines

Contribution to this project!B efore submitting a Pull Request please read [Contributing Guidelines](CONTRIBUTING.md).


---

## Author

Yadigar Camci — HTW Berlin
