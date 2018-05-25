package cap03;

/**
 * Criando a nossa própria interface funcional
 * @author dev
 *
 */

@FunctionalInterface //interface funcional de forma explícita
interface Validador<T> {
	boolean validar(T t);
}
