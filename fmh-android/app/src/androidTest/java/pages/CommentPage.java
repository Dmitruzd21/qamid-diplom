package pages;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;

import io.qameta.allure.kotlin.Allure;
import screenElements.CommentScreen;

public class CommentPage {

    public static void fillInTheCommentField(String comment) {
        Allure.step("Заполнение поля комментария");
        CommentScreen.commentTestInputEditText.perform(replaceText(comment));
    }

    public static void saveComment() {
        Allure.step("Сохранить комментарий");
        CommentScreen.saveButton.perform(click());
    }

    public static void cancelCommentCreation() {
        CommentScreen.cancelButton.perform(click());
    }

}
