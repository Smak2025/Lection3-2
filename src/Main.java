import ru.gr0550x.ui.InMemoryNoteRepository;
import ru.gr0550x.ui.NoteController;
import ru.gr0550x.ui.NoteService;
import ru.gr0550x.ui.NotesWindow;

void main() {
    var repository = new InMemoryNoteRepository();
    var service = new NoteService(repository);
    var controller = new NoteController(service);

    var wnd = new NotesWindow(controller);
    controller.attachView(wnd);

    wnd.setVisible(true);
}