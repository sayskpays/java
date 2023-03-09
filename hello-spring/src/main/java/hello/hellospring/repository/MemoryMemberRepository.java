package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;


public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;


    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    // 루프문이 돌면서 store에 해당 name을 찾음 없으면 Optional null 반환
    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(memberDTO -> memberDTO.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        // store.values() ==  Map 의 values값만 가져오기. 즉 MemberDTO 값만 저장.
        return new ArrayList<>(store.values());
    }

    // Test Case afterEach() 에서 쓰일 메서드
    public void clearStore() {
        store.clear();
    }
}
