[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24217204)
# Conditional Statements: Ordering Numbers 🔢

### Welcome!
This GitHub repository is where you will be working on your activity!

```text
Note: Please read all the information below before starting the activity!
```

For detailed instructions, you can check the presentation here: [Conditionals Presentation](https://docs.google.com/presentation/d/1Suuh6AFzGhEIHeH8XFLLivbjaFaPEG5NcK0ZsYzqUT4/edit?usp=sharing).

---

## Activity Instructions

In this activity, you will write a program that asks the user for two numbers, compares them using an `if/else` statement, and prints them out in ascending order (smallest to largest).

1. Open the `Conditionals.java` starter file.
2. Import the `Scanner` library at the very top of your file.
3. Inside the `main` method, set up your `Scanner` to get input from the user.
4. Ask the user for the first number and store it in an `int` variable.
5. Ask the user for the second number and store it in another `int` variable.
6. Use an `if/else` statement to compare the two numbers.
7. Print the numbers in ascending order, separated by a comma and a space.

> [!WARNING]
> ### 👾 Break-Proofing Your Code (Adversarial Thinking):
> * **The Missing Import:** Java doesn't know what a `Scanner` is by default. If you forget to write `import java.util.Scanner;` at the very top of your file (above the `public class` line), your code will completely fail to compile!
> * **Exact Formatting:** Pay close attention to the Expected Output. It asks for the numbers to be separated by a comma and a space (e.g., `10, 12`). You will need to use String concatenation inside your print statement: `System.out.println(num1 + ", " + num2);`
> * **The Equality Edge Case:** What happens if the user enters `10` and `10`? Think about whether your `if` condition needs to be `<` or `<=`, and how your `else` block will handle a tie! (Hint: For this specific problem, either way works fine, but it's important to think about!)

### Expected Output
```text
Number: 12
Number: 10
10, 12
```

> [!IMPORTANT]
> ### How to submit your activity:

<details>
<summary> If you're using your own VS Code (Recommended):</summary>

```text
1. In your GitHub assignment, open the file with the name of the program that you want to submit.
2. Click the pencil icon ("edit this file") in the right upper corner.
3. Paste the code from your VS Code into GitHub.
4. Click "Commit changes" (Green button in right upper corner).
5. Accept/confirm any prompts, and that's it! You've submitted your activity.
```
</details>

<details>
<summary> If you're using GitHub Codespaces:</summary>

```text
1. Whenever you're ready to submit the activity, click on the "Source Control" tab (usually on the left of your screen).
2. Write your Student ID in the Message textbox (above the green "Commit" button). 
3. Click on commit (if prompted to stage changes, click "Yes").
4. Click on the button "Sync changes", accept everything and that's it!
If you didn't get any errors, you've submitted your activity successfully. Otherwise, send me a message with your error.
```
</details>
