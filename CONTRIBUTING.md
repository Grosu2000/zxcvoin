# Contributing to Console Calculator

Thank you for your interest in contributing! This document describes
the rules and conventions for contributing to this project.

## Branching Strategy

We use **GitHub Flow**:

- `main` — always stable, production-ready code
- `feat/*` — new features
- `fix/*` — bug fixes
- `docs/*` — documentation changes
- `chore/*` — maintenance tasks

## Commit Messages

We follow **Conventional Commits**:

```text
<type>(<scope>): <description>

[optional body]

[optional footer]
```

### Allowed Types

| Type | Purpose |
|------|---------|
| feat | New feature |
| fix | Bug fix |
| docs | Documentation |
| style | Formatting |
| refactor | Code refactoring |
| perf | Performance |
| test | Tests |
| build | Build system |
| ci | CI/CD |
| chore | Maintenance |
| revert | Revert |

### Examples

```text
feat: add square root function
fix: handle division by zero
docs: update user guide
chore: setup pre-commit hooks
```

## Pull Request Rules

1. Every change must go through a Pull Request
2. PR title must follow Conventional Commits format
3. At least one Code Review approval is required
4. All pre-commit hooks must pass
5. Use **Squash and Merge** strategy

## Code Review

We use **Conventional Comments**:

- `nit:` — minor suggestion
- `suggestion:` — improvement idea
- `issue:` — must be fixed
- `question:` — clarification needed
- `praise:` — positive feedback

## Local Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/Grosu2000/zxcvoin.git
   ```

2. Install pre-commit:

   ```bash
   pip install pre-commit
   python -m pre_commit install --hook-type pre-commit --hook-type commit-msg
   ```

3. Build and test:

   ```bash
   .\build.bat
   .\run.bat
   ```

## Questions

Contact the team lead: **Oleksandr**
