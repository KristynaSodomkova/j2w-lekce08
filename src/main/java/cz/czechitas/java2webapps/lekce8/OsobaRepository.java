package cz.czechitas.java2webapps.lekce8;

import org.springframework.data.repository.CrudRepository;
import cz.czechitas.java2webapps.lekce8.entity.Osoba;
import org.springframework.stereotype.Repository;

@Repository
public interface OsobaRepository extends CrudRepository<Osoba, Long> {
}
