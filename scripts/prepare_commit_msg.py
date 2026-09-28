import os
import sys
from datetime import datetime


def main():
    commit_msg_file = sys.argv[1] if len(sys.argv) > 1 else ".git/COMMIT_EDITMSG"
    author = os.environ.get("GIT_AUTHOR_NAME", "Unknown")
    timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")

    with open(commit_msg_file, "rb") as f:
        raw = f.read()
    newline = "\r\n" if b"\r\n" in raw else "\n"

    with open(commit_msg_file, "a", encoding="utf-8", newline="") as f:
        f.write(f"{newline}{newline}# Author: {author}{newline}# Time: {timestamp}{newline}")


if __name__ == "__main__":
    main()
