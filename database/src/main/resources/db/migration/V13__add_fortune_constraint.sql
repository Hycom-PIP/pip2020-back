SET search_path TO fortune;

ALTER TABLE stock
    ADD CONSTRAINT unique_symbol_date UNIQUE (symbol, date, is_historical);