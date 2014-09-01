package javadavadoo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class viewMain extends Shell {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			viewMain shell = new viewMain(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the shell.
	 * @param display
	 */
	public viewMain(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Button btnAceptar = new Button(this, SWT.NONE);
		btnAceptar.setTouchEnabled(true);
		btnAceptar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnAceptar.setBounds(349, 207, 75, 25);
		btnAceptar.setText("Aceptar");
		
		Menu menu = new Menu(this, SWT.BAR);
		setMenuBar(menu);
		
		MenuItem mntmArchivo_1 = new MenuItem(menu, SWT.CASCADE);
		mntmArchivo_1.setText("Archivo");
		
		Menu menu_1 = new Menu(mntmArchivo_1);
		mntmArchivo_1.setMenu(menu_1);
		
		MenuItem mntmSalir = new MenuItem(menu_1, SWT.NONE);
		mntmSalir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		mntmSalir.setText("Salir");
		
		MenuItem mntmAyuda = new MenuItem(menu, SWT.CASCADE);
		mntmAyuda.setText("Ayuda");
		
		Menu menu_2 = new Menu(mntmAyuda);
		mntmAyuda.setMenu(menu_2);
		
		MenuItem mntmAcercaDe = new MenuItem(menu_2, SWT.NONE);
		mntmAcercaDe.setText("Acerca de...");
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Javadavadoo");
		setSize(450, 300);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
