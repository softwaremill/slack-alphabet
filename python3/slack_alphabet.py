def _to_letter(c: str) -> str:
    return f":alphabet-white-{c}:"


def slackify(text: str) -> str:
    return " ".join(map(_to_letter, text))


def main():
    print(slackify(input("Type in the text to translate:")))


if __name__ == "__main__":
    main()
