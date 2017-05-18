package kg.ksucta.service;

import kg.ksucta.domain.subject.Subject;

import java.util.Optional;

public interface SubjectService {
    Optional<Subject> getBySubjectName(String subjectName);
}
