package cap02;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario>{

	@Override
	public void accept(Usuario user) {
		System.out.println(user.toString());
	}

}
