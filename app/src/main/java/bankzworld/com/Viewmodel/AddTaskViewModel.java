package bankzworld.com.Viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import bankzworld.com.Database.JournalDatabase;
import bankzworld.com.Model.JournalEntry;

public class AddTaskViewModel extends ViewModel {

    private LiveData<JournalEntry> task;

    public AddTaskViewModel(JournalDatabase journalDatabase, int id) {
        task = journalDatabase.journalDao().loadJournalById(id);
    }

    public LiveData<JournalEntry> getTask() {
        return task;
    }
}
