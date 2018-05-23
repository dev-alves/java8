package cap02;

import java.util.function.Consumer;

/**
 * Interface funcional que contém apenas um método para implementação
 * @author dev
 *
 */
public class Mostrador implements Consumer<Usuario>{

	@Override
	public void accept(Usuario user) {
		System.out.println(user.toString());
	}

}
