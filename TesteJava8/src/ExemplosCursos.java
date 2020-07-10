class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
	
	public class ExemploCursos {
		public static void main(String[] args) {
			List<Curso> cursos = new ArrayList<Curso>();
			cursos.add(New Curso("Python", 45));
			cursos.add(New Curso("JavaScript", 150));
			cursos.add(New Curso("Java 8", 113));
			cursos.add(New Curso("C", 55));

			cursos.sort(Comparator.comparingInt(Curso::getAlunos));

			cursos.forEach(c -> System.out.println(c.getNome()));

			int sum = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos)
				.forEach(System.out:println)
				.sum();

				System.out.println(sum);

				cursos.stream()
					.filter(c -> c.getAlunos() >= 100)
					.findAny();
					.ifPresent(c -> System.out.println(c.getNome()));

				cursos.stream()
					.mapToInt(c -> c.getAlunos())
    				.average();	

				cursos.stream()
					.filter(c -> c.getAlunos() >= 100)
					.collect(Collectors.toMap(
							c -> c.getNome(),
							c -> c.getAlunos()))
					.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos "));		
	}