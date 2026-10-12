# ADR 0003: Use markdownlint for Documentation Quality

\- \*\*Date\*\*: 2026-10-12

\- \*\*Status\*\*: Accepted

\- \*\*Deciders\*\*: Team zxcvoin

\## Context

Our project includes documentation written in Markdown (README, user guides, ADRs).

Inconsistent formatting (trailing spaces, missing blank lines, wrong list markers)

makes documentation hard to read and review.

We need an automated way to enforce Markdown style rules across the team.

\## Decision

We will use \*\*markdownlint-cli\*\* as a pre-commit hook to automatically check

all `.md` files. The hook is configured in `.pre-commit-config.yaml` with the

`--fix` flag, so simple issues are corrected automatically before each commit.

\## Consequences

\### Positive

\- Consistent documentation style across the team

\- Fewer review comments about formatting

\- New contributors get instant feedback

\### Negative

\- Contributors must learn basic Markdown rules

\- The hook might occasionally block a commit for minor issues

\### Neutral

\- markdownlint runs automatically via pre-commit, no manual setup needed
