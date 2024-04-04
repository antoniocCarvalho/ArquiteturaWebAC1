
CREATE TABLE IF NOT EXISTS public.student
(
    id BIGSERIAL PRIMARY KEY,
    name character varying COLLATE pg_catalog."default",
    document character varying COLLATE pg_catalog."default",
    course character varying COLLATE pg_catalog."default",
    age integer
)

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.student
    OWNER to postgres;