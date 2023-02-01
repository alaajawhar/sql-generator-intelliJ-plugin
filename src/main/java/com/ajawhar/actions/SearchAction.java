package com.ajawhar.actions;

import com.intellij.ide.BrowserUtil;
import com.intellij.lang.Language;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

/**
 * @author Alaa Jawhar
 */
public class SearchAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showInputDialog("message", "title", Messages.getQuestionIcon());

        SqlGeneratorDialogWrapper myIdeaDataDialogWrapper = new SqlGeneratorDialogWrapper(null);
        if (myIdeaDataDialogWrapper.showAndGet()) {
            myIdeaDataDialogWrapper.close(23);
        }


//        Optional<PsiFile> psiFile = Optional.ofNullable(e.getData(LangDataKeys.PSI_FILE));
//        String languageTag = psiFile
//                .map(PsiFile::getLanguage)
//                .map(Language::getDisplayName)
//                .map(String::toLowerCase)
//                .map(lang -> "[" + lang + "]")
//                .orElse("");
//
//        System.out.println("languageTag: " + languageTag);
//        Messages.showMessageDialog(languageTag, "languageTag", Messages.getErrorIcon());
//
//        String txt= Messages.showInputDialog(project, "What is your name?",
//                "Input your name", Messages.getQuestionIcon());
//
//        Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
//        CaretModel caretModel = editor.getCaretModel();
//        String selectedText = caretModel.getCurrentCaret().getSelectedText();
//
//        BrowserUtil.browse("https://stackoverflow.com/search?q=" + languageTag + selectedText);
    }
}
